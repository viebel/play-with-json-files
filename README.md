
# Rationale

Quite often, I need to do some adhoc data calculation on json files like compare them or aggregate thier data.
I want to do this data manipulation inside a Clojure REPL wihtout having to write the code that loads the JSON files.
This is the purpose of this project.

# How to use

```bash
$ clj -e "$(< src/core.clj)" -r a.json b.json
#'read-json-files.core/main
#'read-json-files.core/args
#'read-json-files.core/b
read-json-files.core=>
```


It opens a Clojure REPL, where two vars `a` and `b` are defined. The vars hold a Clojure object of the contents of `a.json` and `b.json`

Inside the REPL, I am free to manipulate `a` and `b`:

```bash
read-json-files.core=> (keys a)
("items")
```


# Implementation details

It is not possible to use both `-m` and `-r` flags. That's why I use the `-e` flag and pass it the contents of the source file.
