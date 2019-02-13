
# Rationale

Quite often, I need to do dome adhoc data calculation on json files like compare them or aggregate thier data.
I want to do this data manipulation inside a Clojure REPL wihtout having to write the code that loads the JSON files.
This is the purpose of this project.

# How to use

```bash
$ clj -e "$(< read_json_files/src/core.clj)" -r a.json b.json
```

It will open a Clojure REPL, where two vars `a` and `b` are defined. The vars hold a Clojure object of the contents of `a.json` and `b.json`
