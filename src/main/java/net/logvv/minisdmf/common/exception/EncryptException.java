package net.logvv.minisdmf.common.exception;

/**
 * 
 * 加解密异常类<br>
 * 
 * @author fanyaowu
 * @date 2014年7月9日
 * @version 1.0.0
 *
 */
public class EncryptException extends Exception {

	/**
	 * serialVersionUID
	 *
	 * @since 1.0.0
	 */

	private static final long serialVersionUID = 1L;

	public EncryptException() {
		super();
	}

	public EncryptException(String msg) {
		super(msg);
	}

	public EncryptException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public EncryptException(Throwable cause) {
		super(cause);
	}

}
