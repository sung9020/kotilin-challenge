/*
*
* @author snow
* @since 9/7/24
*/
class Quest36 {
    fun isAnagram(s: String, t: String): Boolean {
        val map1 = HashMap<String, Int>()
        val map2 = HashMap<String, Int>()
        for(c in s.split("")){
            if(map1.containsKey(c)){
               val value =  map1.getOrDefault(c, 0)
                map1[c] = value + 1
            }else{
                map1[c] = 1
            }
        }

        for(p in t.split("")){
            if(map2.containsKey(p)){
                val value =  map2.getOrDefault(p, 0)
                map2[p] = value + 1
            }else{
                map2[p] = 1
            }
        }

        return map1 == map2
    }

}

fun main(args :Array<String>) {
    val q = Quest36()
    println(q.isAnagram("anagram", "nagaram"))
}