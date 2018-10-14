package net.logvv.minisdmf.common.exception;

/**
 * 
 * rest服务调用异常封装类<br>
 * 
 * @author fanyaowu
 * @date 2014年7月11日
 * @version 1.0.0
 *
 */
public class RestInvocationException extends Exception {

	/**
	 * serialVersionUID
	 *
	 * @since 1.0.0
	 */

	private static final long serialVersionUID = 1L;

	public RestInvocationException() {
		super();
	}

	public RestInvocationException(String msg) {
		super(msg);
	}

	public RestInvocationException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public RestInvocationException(Throwable cause) {
		super(cause);
	}

}
