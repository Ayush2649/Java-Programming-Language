public class FriendsPairing{
    public static int friendspairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        
        int fnm1 = friendspairing(n - 1);

        int fnm2 = friendspairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        int totWays = fnm1 + pairWays;
        return totWays;
    }

    public static void main(String args[]){
        System.out.println(friendspairing(3));
    }
}