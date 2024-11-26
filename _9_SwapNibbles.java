public class _9_SwapNibbles {
    public static void main(String[] args) {
        byte value = (byte) 0xAB;
        byte swap = swapNibbles(value);
        System.out.println(Integer.toBinaryString(value & 0xFF));
        System.out.println(Integer.toBinaryString(swap & 0xFF));
    }
    
    public static byte swapNibbles(byte b) {
        byte upperNibble = (byte) ((b & 0xF0) >>> 4);
        byte lowerNibble = (byte) (b & 0x0F);

        byte swappedByte = (byte) ((lowerNibble << 4) | upperNibble);
        return swappedByte;
    }
}
