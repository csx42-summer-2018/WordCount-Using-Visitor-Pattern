package wordCount.treesForStrings;

public class BSTNode
{
    private String key;

    public BSTNode left, right;

   public int countDistinct=0;

	public void setKey(String key) {
		this.key = key;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public BSTNode( String key)
    {
        this.key = key;
  
    }

    //if key not found in BST then it is added. If jey already exists then that node's value
    //is updated.
    public void put( String key )
    {
        if ( key.compareTo( this.key ) < 0 )         
        {             
            if ( left != null )             
            {                 
                left.put( key ); 
                countDistinct++;
            }             
            else             
            {                 
                left = new BSTNode( key );             
            }         
        }         
        else if ( key.compareTo( this.key ) > 0 )
        {
            if ( right != null )
            {
                right.put( key );
                countDistinct++;
            }
            else
            {
                right = new BSTNode( key);
            }
        }
        else
        {
            //update this one
            
        }
    }
   
    public int getCountDistinct() {
		return countDistinct;
	}

	public void setCountDistinct(int countDistinct) {
		this.countDistinct = countDistinct;
	}

	//find Node with given key and return it's value
    public Object get( String key )
    {
        if ( this.key.equals( key ) )
        {
            return key;
        }

        if ( key.compareTo( this.key ) < 0 )
        {
            return left == null ? null : left.get( key );
        }
        else
        {
            return right == null ? null : right.get( key );
        }
    }

	public String getKey() {
		
		return key;
	}
}