import java.util.Scanner; //importing Scanner to use boolean specially
class Takingboolean{ 
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.println("^^^Select True or False^^^\nPress any number to continue"); // it is the starting of program
		int a=obj.nextInt(); // taking int to get permission to continue
		System.out.println("We have 10 questions, if you will be qualified till last you will win and get a little gift\nPress any number to continue"); //telling about the game to the user
		int b=obj.nextInt(); //taking int to get permission to continue
		System.out.println("1: Charlie Babbage was the founder and father of Computer. True/False"); //first question
		boolean c=obj.nextBoolean(); //getting answer of first question from the user
		if(c==false){
			System.out.println("Congratulations You Qualified For Next Round\nPress any number to continue");
			int d=obj.nextInt(); //asking for permission to continue
			System.out.println("2: Mark Zuckerberg was 18 years old when he invented his famous social media site Facebook True/False"); //second question
			boolean e=obj.nextBoolean(); //getting answer of second question from the user
			if(e==false){
				System.out.println("Congratulations You Qualified For Next Round\nPress any number to contiue");
				int f=obj.nextInt(); //taking permission to continue
				System.out.println("3: BigBang was a big explossion with super soundwaves. True/False"); //third question
				boolean g=obj.nextBoolean(); //asking user for answer
				if(g==false){
					System.out.println("Congratulations You Have Qualified For Round 4\nPress any number to continue");
					int h=obj.nextInt(); //asking user for permission to go to 4th round
					System.out.println("4: Planet Saturn is Famous for Alians. True/False");
					boolean i=obj.nextBoolean(); //getting answer from the user
					if(i==false){
						System.out.println("Congratulations You Qualified for 5th Round\n Press any numer to continue");
						int j=obj.nextInt(); //taking permission to continue
						System.out.println("*We gave you 4th easier, but be active for 5th*"); //statement before continuing
						System.out.println("5: If an object moves at constant velocity, then there must be one force acting on the object is\nstatement of Newton's Second Law Of Motion in other words"); //fifth question
						boolean k=obj.nextBoolean();
						if(k==false){
							System.out.print("O My God! You Are Genious. Please I would like to know your name.\nMy Name Is >>> ");
							String l=obj.next();
							System.out.println("ThankYou "+l+" Press any number to continue");
							int m=obj.nextInt();
							System.out.println("6: Water is dangrous for life, but needed. True/False"); //sixth question
							boolean n=obj.nextBoolean(); //taking answer from the user
							if(n==true){
								System.out.println("Congratulations You Passed 6th Round, best of luck go ahead.\nEnter any number to continur");
								int o=obj.nextInt();
								System.out.println("7: Everybody in this universe have attrection towards their bodies. True/False");//seventh question
								boolean p=obj.nextBoolean();
								if(p==false){
									System.out.println("Congratulations you are qualified for round 8\nEnter any nymber to continue.");
									int q=obj.nextInt(); //taking permission to continue
									System.out.println("8: According to past Science, earth was on a water. True/False");
									boolean r=obj.nextBoolean();
									if(r==true){
										System.out.println("Congratulations you are going too good, some more to go.\nEnter any number to continue.");
										int s=obj.nextInt();
										System.out.println("9: World War 1 began in 1914. True/False");//ninth question
										boolean t=obj.nextBoolean();
										if(t==true){
											System.out.println("Hey Do You Know Your Answer Was Right?\nCongratulations You are qualified for FINAL Round.\nBe careful I want you to win this game\nEnter any number to continue.");
											int u=obj.nextInt();
											System.out.println("\n\t\t\t*****FINAL ROUND*****\n\n10: Algebra Boolean was the father of Algebra. True/False");//10th round
											boolean v=obj.nextBoolean();
											if(v==false){
											System.out.println("\nCongratulations "+l+" You Won The Game, You Can Pass Every Game of Life.\nSelect The Number and get the gift\n1.\n2.\n3.\n4.\n5.");
											int w=obj.nextInt(); //taking luckydraw value from the user
												if(w==1){
													System.out.println("You Won Nothing.");
												}
												else if(w==2){
													System.out.println("You Won Nothing.");
												}
												else if(w==3){
													System.out.println("You Won Nothing.");
												}
												else if(w==4){
													System.out.println("You Won 10Rs.");
												}
												else if(w==5){
													System.out.println("You Won Another Chance.\nChose a Number\n1.\n2.\n3.\n4.\n5.");
													int x=obj.nextInt();
													if(x==1){
														System.out.println("You Won Nothing");
													}
													else if(x==2){
														System.out.println("You Won Nothing");
													}
													else if(x==3){
														System.out.println("You Won 10Rs");
													}
													else if(x==4){
														System.out.println("You Won Nothing");
													}
													else if(x==5){
														System.out.println("You Won Nothing");
													}
													else{
														System.out.println("This Option Was Not Present You Lost Your Chance.");
													}
												}
												else{
													System.out.println("This option wasn't present, you lost your chance");
												}
											}
											else{
												System.out.println("Opps, at the end your luck didn't help you. I am sorry, try again later.");
											}
							
											
										}
										else{
											System.out.println("You were too close but you had to lose.");
										}
										
									}
									else{
										System.out.println("Huuf, You had to lose now.");
									}
								}
								else{
									System.out.println("You Lost. Dont worry you came good, next time :). The true answer was 'towards their center'");
									
								}
							}
							else{
								System.out.println("Best of luck for the next time.");
							}
							
						}
						else{
							System.out.println("Haha I Told You, you lost. The right answer is 'Newton's First Law of Motion'.");
						}
						
					}
					else{
						System.out.println("Sorry You Lost. It was most easiest. Alright Next Time.\nThe Answer Was 'Mars'.");
					}
					
				}
				else{
					System.out.println("Nice Try, But You Lost Now. You went good.\nTrue answer was 'There is no Sound in Space'");
				}
				
			}
			else{
				System.out.println("*Best Of Luck For Next Time*\nThe right answer was '19'");
			}
		}
		else{
			System.out.println("You Lost Before Starting, Poor.\nTrue answer is 'Charles Babbage'.");
		}
		
	}
}