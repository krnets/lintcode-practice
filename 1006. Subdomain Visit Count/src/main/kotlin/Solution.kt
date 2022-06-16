class Solution {
    fun subdomainVisits(cpdomains: Array<String>): List<String> {
        val visitMap = mutableMapOf<String, Int>()

        for (countPair in cpdomains) {

            val (visits, domain) = countPair.split(" ")
            val n = visits.toInt()
            val subDomains = domain.split(".")

            for (i in subDomains.indices) {
                val sub = subDomains.drop(i).joinToString(".")

                visitMap[sub] = n + visitMap.getOrDefault(sub, 0)
            }
        }

        return visitMap.map { "${it.value} ${it.key}" }
    }
}