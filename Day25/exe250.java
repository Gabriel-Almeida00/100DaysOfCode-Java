package Day25;

import java.util.BitSet;
import java.util.Scanner;

public class exe250 {
	public static int convert_crc32(byte[] data) {
        BitSet bitSet = BitSet.valueOf(data);
        int crc32 = 0xFFFFFFFF; 
        for (int i = 0; i < data.length * 8; i++) {
            if (((crc32 >>> 31) & 1) != (bitSet.get(i) ? 1 : 0))
                crc32 = (crc32 << 1) ^ 0x04C11DB7;  
            else
                crc32 = (crc32 << 1);
        }
        crc32 = Integer.reverse(crc32);  
        return crc32 ^ 0xFFFFFFFF;  
    }
    
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
		String str1 = scanner.nextLine();
		System.out.println("crc32 checksum of the string: "+Integer.toHexString(convert_crc32(str1.getBytes())));		
		}           
}
