class phonecalculator extends Calculator {
	int val=0;
	int sub;
	int add(int x,int y)
	{
int val=super.add(x,y);
	int total=val-sub;
	return total;
}
	phonecalculator(int b)
	{
		sub=b;
	}
}