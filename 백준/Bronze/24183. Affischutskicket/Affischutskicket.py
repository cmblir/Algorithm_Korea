C4, A3, A4 = map(int, input().split())
CCCC = 0.229 * 0.324 # 봉투 C4의 규격
AAA = 0.297 * 0.420 # 봉투 A3의 규격
AAAA = 0.210 * 0.297 # 봉투 A4의 규격
# 120 90 70
print(round((C4 * 2 * CCCC) + (A3 * 2 * AAA) + (A4 * AAAA), 7))
# 각 봉투에 대해 C4는 2장을 합친거니까 *2, A3도 2개의 포스터니까 *2, A4는 1개이니까 그냥 1