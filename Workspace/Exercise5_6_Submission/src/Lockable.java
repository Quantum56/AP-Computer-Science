/**
 * @author ZackB
 *
 */
public interface Lockable {
	
	void setKey(int input) throws Exception;

	void lock(int passwd) throws Exception;
	void unlock(int attempt) throws Exception;
	boolean locked();
}
