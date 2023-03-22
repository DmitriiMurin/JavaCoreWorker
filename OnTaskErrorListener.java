package JavaCore.HomeWork.Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
