/* public class intValue
  {
    public int value;


    
    // Object로 인스턴스화 하는 이유
    // 같은 클래스 이외에 서로 다른 클래스 끼리 비교할 수 있기 때문이다.
    @Override
    public boolean equals(Object obj)
    {
      try
      {
        if (this.value == ((intValue)obj).value)
        {
          return true;
        }
        else
        {
          return false;
        }
      }
      catch (ClassCastException excp)
        {
          return false;
        }

    }
  } */