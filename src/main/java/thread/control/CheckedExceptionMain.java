package thread.control;

import util.ThreadUtils;

import static util.ThreadUtils.*;

public class CheckedExceptionMain {

    public static void main(String[] args) throws Exception {

        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {
        @Override
        public void run() {
            //throw new Exception();    //주석풀면 컴파일 오류
            sleep(1000);
        }
    }
}
