package JavaCore.HomeWork.Worker;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i <= 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task 33 - ERROR");
            } else
                callback.onDone("Task " + i + " is done");
        }
    }
}
