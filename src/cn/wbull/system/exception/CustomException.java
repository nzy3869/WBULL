package cn.wbull.system.exception;

public class CustomException extends Exception {

	
	//�쳣��Ϣ
    private String message;

    public CustomException(String message)
    {
        super(message);
        this.message=message;

    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
