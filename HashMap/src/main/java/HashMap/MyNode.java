package HashMap;

public class MyNode<k> implements INode<k> {

	private k key;
	private INode<k> next;

	public MyNode(k key) {
		super();
		this.key = key;
		this.next = null;
	}

	@Override
	public k getKey() {
		return key;
	}

	@Override
	public void setKey(k key) {
		this.key = key;
	}

	@Override
	public void setNext(INode<k> next) {

		this.next = next;
	}

	@Override
	public INode<k> getNext() {
		return next;
	}

}
