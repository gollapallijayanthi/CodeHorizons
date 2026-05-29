class Solution:
    def passwordStrength(self, password: str) -> int:
        ans = 0

        lower = set()
        upper = set()
        digit = set()
        special = set()

        for ch in password:
            if ch.islower() and ch not in lower:
                ans += 1
                lower.add(ch)

            elif ch.isupper() and ch not in upper:
                ans += 2
                upper.add(ch)

            elif ch.isdigit() and ch not in digit:
                ans += 3
                digit.add(ch)

            elif ch in "!@#$" and ch not in special:
                ans += 5
                special.add(ch)

        return ans