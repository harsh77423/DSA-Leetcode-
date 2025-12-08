class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle);

// int k = needle.length();

// int j= 0;
// int i =0 ;
// while(j < haystack.length()){
//     if(j - i+1 == k){
//         String s1 = haystack.substring(i , j+1);
//         if(needle.equals(s1)){
//             return i;

//         }
//         i++;

//     }
//     j++;

// }
// return -1;

int n = haystack.length();
int m = needle.length();

for(int i=0; i <= n-m ; i++){
    int k=0;

for( k=0; k < m ; k++){

if(haystack.charAt(i+k) != needle.charAt(k)){
    break;
}
}

// if(s1[i++] != s2[j]) break;}
if(k == m) {
return i;}
}

return -1;
    }
}