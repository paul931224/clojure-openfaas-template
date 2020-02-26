# clojure-openfaas-template
Clojure template for openfaas functions


To install this template, run the following command:

```
faas-cli template pull https://github.com/paul931224/clojure-openfaas-template
```
If you ever need to update the template, simply run the the command above with the --overwrite flag.

This command will create (if necessary) a new folder template and add this template to it.

You can read more about how templates work in the faas-cli documentation.

Usage
Create a new function with the following command:

```
faas-cli new my-function --lang=clojure
```
