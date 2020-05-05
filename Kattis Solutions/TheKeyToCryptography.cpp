// TheKeyToCryptography

#include <iostream>
#include <string>

using namespace std;

string messages = "";
string keys = "";

string autoKeycipherText(string messages, string keys) {
    for (int i = 0; i < messages.length(); i++) {
        int k_index = i % keys.size();
        int m_index = (messages[i] - 'A') - (keys[k_index] - 'A');
        if (m_index >= 26) { m_index -= 26; }
        if (m_index < 0) { m_index += 26; }
        messages[i] = m_index + 'A';
        keys[k_index] = messages[i];
    }
    return messages;
}

int main()
{
    cin >> messages >> keys;
    cout << autoKeycipherText(messages, keys);

    return 0;
}
