package bookshelf;

public class BookShelf extends shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
