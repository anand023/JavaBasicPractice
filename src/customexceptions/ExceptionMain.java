package customexceptions;

public class ExceptionMain {

    public static void main(String[] args) {

    }
    public void throwUncheckedException(){
        throw new UnCheckedExceptions();
    }
    public void throwCheckedException() throws CheckedException {
        throw new CheckedException();
    }
}
