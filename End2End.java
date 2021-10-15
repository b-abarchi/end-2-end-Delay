package a1;

public class End2End {

	public static void main(String[] args) {
		System.out.println("Part A: the comparison of size of each packet vs. the end-to-end delay\n");
		compEnd();
		System.out.println("Part B: Assume the overhead caused by the header fields is 10 bits \n");
		compEnd10();
		System.out.println("Part C: Assume the overhead caused by the header fields is 20 bits \n");
		compEnd20();
		
	}
	public static void compEnd() { //compare end2end
		int packetSize[] = {4000,2000,1000,500,250,125};
		
		double end2End = 0;
		for(int i = 0; i< packetSize.length; i++) {
		double speed = 4000;
		double  ts  = packetSize[i]/speed;
		end2End = (ts * 2) + ((16000/packetSize[i]) * ts); 
		System.out.println("for packet size = "+ packetSize[i] +", e2e = " + end2End + "\n");
	}}
	public static void compEnd10() { //compare end2end
		int packetSize[] = {4000,2000,1000,500,250,125};
		
		double end2End = 0;
		for(int i = 0; i< packetSize.length; i++) {
		double speed = 4000;
		double  ts  = (packetSize[i]+10)/speed ;
		end2End = (ts * 2) + ((16000/packetSize[i]) * ts); 
		System.out.println("for packet size = "+ packetSize[i] +", e2e = " + end2End + "\n");
	}}
	public static void compEnd20() { //compare end2end
		int packetSize[] = {4000,2000,1000,500,250,125};
		
		double end2End = 0;
		for(int i = 0; i< packetSize.length; i++) {
		double speed = 4000;
		double  ts  = (packetSize[i]+20)/speed ;
		end2End = (ts * 2) + ((16000/packetSize[i]) * ts); 
		System.out.println("for packet size = "+ packetSize[i] +", e2e = " + end2End + "\n");
	}}
}
