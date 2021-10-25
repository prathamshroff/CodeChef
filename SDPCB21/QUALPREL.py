# Contest: SnackDown Practice Contest: Beginner (SDPCB21)
# Problem: Qualifying to Pre-Elimination (QUALPREL)

for i in range(int(input())):
    n, k, ct = [int(x) for x in input().split()] + [0]
    s = [int(x) for x in input().split()]
    s.sort(reverse = True)
    for i in s:
        if i >= s[k-1]: ct += 1
    print(ct)
