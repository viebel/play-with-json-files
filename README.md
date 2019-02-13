
# Rationale

Quite often, I need to do dome adhoc data calculation on json files like compare them or aggregate thier data.
I want to do this data manipulation inside a Clojure REPL wihtout having to write the code that loads the JSON files.
This is the purpose of this project.

# How to use

```bash
$ clj -e "$(< src/core.clj)" -r a.json b.json
```

It will open a Clojure REPL, where two vars `a` and `b` are defined. The vars hold a Clojure object of the contents of `a.json` and `b.json`


# Implementation details

It is not possible to use both `-m` and `-r` flags. That's why I use the `-e` flag and pass it the contents of the source file.
