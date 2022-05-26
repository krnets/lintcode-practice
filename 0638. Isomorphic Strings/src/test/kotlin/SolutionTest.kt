import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isIsomorphic("egg", "add"))
        assertTrue(Solution().isIsomorphic("aab", "bbc"))
        assertTrue(Solution().isIsomorphic("paper", "title"))
        assertFalse(Solution().isIsomorphic("foo", "bar"))
        assertFalse(
            Solution().isIsomorphic(
                "a`%ii,VEZQc_BSU%ObO5<sX81B/bOw+CNUd#Uav*P!Ax!#>hh,k#b/|>4ixFQZl+l!?bJjakbQbGglEb<g>Hf81m@A9GIvbd]qh?y__t+E(Iyv7zUEfZF{81VaM-0u?]tG=_fFR/XJ=X{-,oRpxE9u*VNYlM",
                "b`%ii-WE[Qc_BSV%OcO5<sX82B/cOw+CNVd#Vbv*P!Bx!#?hh-k#c/|?4ixFQ[l+l!?cJkbkcQcGhlEc<h?Hf82m@B9GIvcd]rh?y__t+E(Iyv7{VEf[F{82WbN/0u?]tG=_fFR/XJ=X{/-oRpxE9u*WNYlN"
            )
        )
    }
}
