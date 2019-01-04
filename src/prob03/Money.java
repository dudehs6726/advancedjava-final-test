package prob03;

public class Money {

	private int amount;

	public Money(int amount) {
    	this.amount = amount;
    }
    
    public Money add(Money add) {
    	return new Money( this.amount + add.amount );
    }
    
    public Money minus(Money min) {
    	return new Money( this.amount - min.amount );
    }
    
    public Money multiply(Money mul) {
    	return new Money( this.amount * mul.amount);
    }

    public Money devide(Money dev) {
    	return new Money( this.amount / dev.amount);
    }

    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (getClass() == obj.getClass() && amount == ((Money)obj).amount)
			return true;
		return false;
		
	}
    
    
}
