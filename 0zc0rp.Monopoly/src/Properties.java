
public class Properties extends BoardSpace
	{
		private boolean developing;
		private int basicRent;
		private int oneHouseRent;
		private int twoHouseRent;
		private int threeHouseRent;
		private int hotelRent;
		
		public Properties(boolean d , int br , int or , int tr , int thr , int hr)
		{
			developing = d;
			basicRent = br;
			oneHouseRent = or;
			twoHouseRent = tr;
			threeHouseRent = thr;
			hotelRent = hr;
		}

		public boolean isDeveloping()
			{
				return developing;
			}

		public void setDeveloping(boolean developing)
			{
				this.developing = developing;
			}

		public int getBasicRent()
			{
				return basicRent;
			}

		public void setBasicRent(int basicRent)
			{
				this.basicRent = basicRent;
			}

		public int getOneHouseRent()
			{
				return oneHouseRent;
			}

		public void setOneHouseRent(int oneHouseRent)
			{
				this.oneHouseRent = oneHouseRent;
			}

		public int getTwoHouseRent()
			{
				return twoHouseRent;
			}

		public void setTwoHouseRent(int twoHouseRent)
			{
				this.twoHouseRent = twoHouseRent;
			}

		public int getThreeHouseRent()
			{
				return threeHouseRent;
			}

		public void setThreeHouseRent(int threeHouseRent)
			{
				this.threeHouseRent = threeHouseRent;
			}

		public int getHotelRent()
			{
				return hotelRent;
			}

		public void setHotelRent(int hotelRent)
			{
				this.hotelRent = hotelRent;
			}
	}
