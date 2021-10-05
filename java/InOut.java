import java.io.*
public static InOut{
	private static BufferedReader in =null;
	static{
		in=new BufferedReader(new InputStreamReader(System.in));
	}
	private static int setInt(String message){
		String value_string="";
		int value_int=0;
		System.out.print(message);
		do{
			try{
				value_string=in.readLine();
				value_int=Integer.parseInt(value_string);
				break;
			}catch(IOException e){
				e.printStackTrace();
			}catch(NumberFormatException ex){
				System.out.print("Please set an Integer");
			}
		}while(true);
		return value_int;
	}

	private static float setString(String message){
		String value_string="";
		float value_float=0
		System.out.print(message);
		do{
			try{
				value_string=in.readLine();
				value_float=Float.parseFloat(value_string);
				break;
			}catch(IOException e){
				e.printStackTrace();
			}catch(NumberFormatException ex){
				System.out.print("Please set an Integer");	
			}
		}while(true);
		return value_float;
	}

	private static String setString(String message){
		String value_string="";
		try{
			value_string=in.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}		
		return value_string;
	}
}