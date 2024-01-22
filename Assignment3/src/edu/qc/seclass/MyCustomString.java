package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface {
	private String strings;
	
	@Override
	public String getString() {
		if (strings.isEmpty()) {
			return null;
		}
		return this.strings;	
	}
	
	@Override
	public void setString(String string) {
		this.strings = string;	
	}

	@Override
	public int countNumbers() {
		int counts = 0;
		boolean notLastDigit = true;
		
		//test If the current string is empty, the method should return 0.
		if(this.strings.isEmpty()) {
            return 0;
        }
		
		//test NullPointerException If the current string is null
		else if(this.strings.equals(null)) {
			throw new NullPointerException("null");
		}
		
		else {
			for(int i = 0; i < this.strings.length(); i++) {
				if(Character.isDigit(this.strings.charAt(i))) {		//digits 0-9
					if(notLastDigit) {
						counts++;
						notLastDigit = false;
				}
		}
			else {
				notLastDigit = true;
			}
		}
		return counts;
	}
}
	@Override
	public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {			//n is the position
		//IllegalArgumentException If "n" less than or equal to zero
		if (n <= 0) {
			throw new IllegalArgumentException("N has to be greater than 0.");
		}
		//NullPointerException If the current string is null and "n" is greater than zero
		if (this.strings == null && n > 0) {
            throw new NullPointerException();
        }
		if (n > this.strings.length()) {
			 return ""; 	//empty string
		}
               
		
		String postion = "";
			char[] c = this.strings.toCharArray();
		
		if(startFromEnd) {
			for(int i = this.strings.length() % n; i < this.strings.length(); i += n) {
				postion += c[i];
			}
		}
		else {
			for(int i = n-1; i < this.strings.length(); i += n) {
				postion += c[i];
			}
		}
		return postion;

	}

	@Override
	public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
		if (startPosition > endPosition) {
			throw new IllegalArgumentException("Invalid start and end position.");	//If "startPosition" > "endPosition"
        }
		
		//If "startPosition" <= "endPosition", but either "startPosition" or "endPosition" are out of bounds (i.e., either less than 1 or greater than the length of the string)
        else if ((startPosition <= endPosition) && ((startPosition < 1 || endPosition > this.strings.length()))) {
        	throw new MyIndexOutOfBoundsException("Out of bound");
        }
		
        //If "startPosition" <= "endPosition", "startPosition" and "endPosition" are greater than 0, and the current string is null
        else if ((startPosition <= endPosition) && ((startPosition > 0 && endPosition > 0 && this.strings == null))) {
            throw new NullPointerException("Null string");
        }
		
        else {
        	StringBuffer result = new StringBuffer();
        	for(int i = 0; i < this.strings.length(); i++) {
        		if(Character.isDigit(strings.charAt(i)) && i >= startPosition-1 && i <= endPosition -1){
        			
        			switch(strings.charAt(i)) {		//changed the digits to English numbers
                    case '0' : 
                        result.append("Zero");
                        break;
                    case '1' : 
                        result.append("One");
                        break;
                    case '2' : 
                        result.append("Two");
                        break;
                    case '3' : 
                        result.append("Three");
                        break;
                    case '4' : 
                        result.append("Four");
                        break;
                    case '5' : 
                        result.append("Five");
                        break;
                    case '6' : 
                        result.append("Six");
                        break;
                    case '7' : 
                        result.append("Seven");
                        break;
                    case '8' : 
                        result.append("Eight");
                        break;
                    case '9' : 
                        result.append("Nine");
                        break;
        			}
        		}
                else {
                    result.append (this.strings.charAt(i));
                }
            }
            this.strings = result.toString();
        }
}
	}
