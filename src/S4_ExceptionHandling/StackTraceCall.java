package S4_ExceptionHandling;

/**
 * Created by megmeehey on 14.07.17.
 */
public class StackTraceCall {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length > 3) {
            StackTraceElement element = stackTraceElements[3];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            return className + "#" + methodName;
        } else {
            return null;
        }
    }
}
