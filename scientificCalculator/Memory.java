/*package whatever //do not write package name here */

package scientificCalculator;

class Memory{
	int mem;
	Memory(){
		mem=0;
	}
	public int memrecall(){						//MR: Recall the value in memory
		return mem;
	}
	public void memstore(int num){				//MS: Store value of display into memory
		mem=num;
	}
	public void memplus(int num){				//M+: Adds the display value into the memory value and stores it in memory
		mem=mem+num;
	}
	public void memclear(){						//MC: Clears memory
		mem=0;
	}
}
