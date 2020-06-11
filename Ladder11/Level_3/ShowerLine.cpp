#include <iostream>
#include <stdio.h>
#include <algorithm>

using namespace std;

int g[6][6];

int main()
{
    int n = 5;
    for (int i = 0 ; i < n ; ++i)
        for (int j = 0 ; j < n ; ++j)
            cin >> g[i][j];
    int p[6], pans[6], ans = -1, tmp;
    for (int i = 0 ; i < n ; ++i)
        p[i] = i;

    do
    {
        //01234
        tmp = g[p[0]][p[1]] + g[p[1]][p[0]];
        tmp += g[p[2]][p[3]] + g[p[3]][p[2]];

        //1234
        tmp += g[p[1]][p[2]] + g[p[2]][p[1]];
        tmp += g[p[3]][p[4]] + g[p[4]][p[3]];

        //234
        tmp += g[p[2]][p[3]] + g[p[3]][p[2]];

        //34
        tmp += g[p[3]][p[4]] + g[p[4]][p[3]];

        if (tmp > ans)
        {
            ans = tmp;
            for (int i = 0 ; i < n ; ++i)
                pans[i] = p[i];
        }
    }
    while (next_permutation(p, p + n));

    cout << ans << "\n";
    return 0;
}