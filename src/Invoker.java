import java.lang.reflect.Method;

public class Invoker {
    public static void main(String[] args) {
        System.out.println("Reflection and annotations");

        MyClass obj = new MyClass("TestObject", 50);
        Method[] methods = MyClass.class.getDeclaredMethods();

        System.out.println("Total methods in class: " + methods.length);

        int annotatedMethodsCount = 0;
        int totalInvocations = 0;

        for (Method method : methods) {
            if (method.isAnnotationPresent(Repeat.class) &&
                    !java.lang.reflect.Modifier.isPublic(method.getModifiers())) {

                Repeat repeatAnnotation = method.getAnnotation(Repeat.class);
                int times = repeatAnnotation.times();

                System.out.println("Found annotated method:");
                System.out.println("Method: " + method.getName());
                System.out.println("Modifier: " + getModifierName(method.getModifiers()));
                System.out.println("Annotation @Repeat(times = " + times + ")");
                System.out.println("Parameters: " + method.getParameterCount());

                method.setAccessible(true);

                System.out.println("Invocations:");
                for (int i = 1; i <= times; i++) {
                    try {
                        Object result = invokeMethod(method, obj, i);
                        if (result != null) {
                            System.out.println("Result: " + result);
                        }
                        totalInvocations++;
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }

                annotatedMethodsCount++;
            }
        }

        System.out.println("Summary:");
        System.out.println("Annotated methods found: " + annotatedMethodsCount);
        System.out.println("Total invocations: " + totalInvocations);
    }

    private static Object invokeMethod(Method method, Object obj, int callNumber) throws Exception {
        String methodName = method.getName();
        Class<?>[] paramTypes = method.getParameterTypes();

        if (paramTypes.length == 0) {
            return method.invoke(obj);
        } else if (paramTypes.length == 1) {
            if (paramTypes[0] == String.class) {
                return method.invoke(obj, "Call_" + callNumber);
            } else if (paramTypes[0] == int.class) {
                return method.invoke(obj, callNumber * 10);
            }
        } else if (paramTypes.length == 2) {
            if (paramTypes[0] == int.class && paramTypes[1] == int.class) {
                return method.invoke(obj, callNumber, callNumber * 2);
            } else if (paramTypes[0] == String.class && paramTypes[1] == int.class) {
                return method.invoke(obj, "Text", callNumber);
            }
        }

        try {
            return method.invoke(obj);
        } catch (Exception e) {
            return "Failed to invoke with parameters: " + paramTypes.length;
        }
    }

    private static String getModifierName(int modifiers) {
        if (java.lang.reflect.Modifier.isPrivate(modifiers)) return "private";
        if (java.lang.reflect.Modifier.isProtected(modifiers)) return "protected";
        if (java.lang.reflect.Modifier.isPublic(modifiers)) return "public";
        return "package-private";
    }
}