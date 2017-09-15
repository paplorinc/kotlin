//file
class Test {
    public void operationsWithChar() {
        char c = 1;
        int i = 1;

        b(i > c);
        b(i >= c);
        b(i < c);
        b(i <= c);

        b(c > i);
        b(c >= i);
        b(c < i);
        b(c <= i);

        b(c == i);
        b(c != i);

        b(i == c);
        b(i != c);

        i(i + c);
        i(i - c);
        i(i / c);
        i(i * c);
        i(i % c);
        i(i | c);
        i(i & c);
        i(i << c);
        i(i >> c);
        i(i >>> c);

        i(c + i);
        i(c - i);
        i(c / i);
        i(c * i);
        i(c % i);
        i(c | i);
        i(c & i);
        i(c << i);
        i(c >> i);
        i(c >>> i);

        // TODO i(~c);
        // TODO i(-c);
        // TODO i(+c);
    }

    public void operationsWithCharLiteral() {
        int i = 1;

        b(i > '0');
        b(i >= '0');
        b(i < '0');
        b(i <= '0');

        b('0' > i);
        b('0' >= i);
        b('0' < i);
        b('0' <= i);

        b('0' == i);
        b('0' != i);

        b(i == '0');
        b(i != '0');

        i(i + '0');
        i(i - '0');
        i(i / '0');
        i(i * '0');
        i(i % '0');
        i(i | '0');
        i(i & '0');
        i(i << '0');
        i(i >> '0');
        i(i >>> '0');

        i('0' + i);
        i('0' - i);
        i('0' / i);
        i('0' * i);
        i('0' % i);
        i('0' | i);
        i('0' & i);
        i('0' << i);
        i('0' >> i);
        i('0' >>> i);

        // TODO i(~'0');
        // TODO i(-'0');
        // TODO i(+'0');
    }

    public void operationsWithCharLiterals() {
        b('A' > '0');
        b('A' >= '0');
        b('A' < '0');
        b('A' <= '0');

        b('0' == 'A');
        b('0' != 'A');

        i('A' + '0');
        i('A' - '0');
        i('A' / '0');
        i('A' * '0');
        i('A' % '0');
        i('A' | '0');
        i('A' & '0');
        i('A' << '0');
        i('A' >> '0');
        i('A' >>> '0');
    }

    public void b(boolean b) {}
    public void i(int i) {}
}
