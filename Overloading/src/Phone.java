class Phone {
	void Whatsapp(boolean  attachment)
	{
		if (attachment == true)
			System.out.println("Successfully Uploaded");
		else
			System.out.println("Failed");
	}
		void Whatsapp(int call)
		{
			if(call == 1)
				System.out.println("Calling Successfully");
			else
				System.out.println("Fail");
		}
	}