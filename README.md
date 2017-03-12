# left-pad

A Clojure library designed to add left padding to a string.

## Usage

```clojure
(leftpad "hello" 8) => "   hello"
(leftpad "hello" 2) => "hello"
(leftpad "hello" 8 0) => "000hello"
(leftpad "hello") => "     hello"
```

## License

MIT
