/* class Point
  {
    protected int xPos = 0;
    protected int yPos = 0;
    
    public Point()
      {
        
      }

    public Point(int _xPos, int _yPos)
    {
      xPos = _xPos;
      yPos = _yPos;
    }

    public int getX()
    {
      return xPos;
    }

    public int getY()
    {
      return yPos;
    }

    public void setX(int _xPos)
    {
      xPos = _xPos;
    }

    public void setY(int _yPos)
    {
      yPos = _yPos;
    }

    @Override
    public String toString()
    {
      return "X : " + xPos + ", Y : " + yPos;
    }

    @Override
    protected boolean equals(Object obj)
    {
      if(this.xPos == ((Point)obj).xPos) &&
        (this.yPos == ((Point)obj).yPos))
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    
  } */