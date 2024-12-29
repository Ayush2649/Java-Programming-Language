#include<bits/stdc++.h>
using namespace std;
using ll = long long;

vector<string> read(){
    vector<string> strs;
    string line;
    getline(cin, line);
    istringstream iss(line);
    copy(istream_iterator<string>(iss), istream_iterator<string>(), back_inserter(strs));
    return strs;
}

map<string, vector<string>> graph;
map<string, ll> mask, id;
map<string, string> open;

ll ans = 0;

ll dfs1(string &u){
    ll curr = id.count(u) ? 1LL << id[u] : 0;
    for(string &v : graph[u]) curr |= dfs1(v);
    return mask[u] = curr;
}

void dfs2(string &u, int bit){
    if(id[u] == bit){
        open[u] = u;
        return;
    }
    for(string &v : graph[u]){
        if(mask[v] >> bit & 1){
            if(open[u] != v) ans++, open[u] = v;
            return dfs2(v, bit);
        }
    }
}

int main(){
    ll N;
    cin >> N;
    cin.ignore();

    while(N--){
        vector<string> children = read();
        reverse(children.begin(), children.end());
        string parent = children.back();
        children.pop_back();
        graph[parent] = children;
    }

    ll cid = 0;
    vector<string> colors = read();
    for(string &color : colors) if(!id.count(color)) id[color] = ++cid;

    string u = "source";
    dfs1(u);

    for(string &color : colors) dfs2(u, id[color]);

    cout << ans;

    return 0;
}
