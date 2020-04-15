// Time Complexity - O(n)
// Space Complexity - O(1)


public class Solution extends Relation {
    public int findCelebrity(int n) {
        int celeb =0;
        for(int person=0;person < n;person++){
            if(knows(celeb,person))
                celeb = person;
        }
        
        for(int person =0;person < n;person++){
            if(celeb == person) continue;
            if(knows(celeb,person) || !knows(person,celeb))
                return -1;
        }
        return celeb;
    }
}
