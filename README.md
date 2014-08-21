JokoScript
==========

A semi-programming language based on `Hasmaps`

```
new Hasmap<function, doPrintSin>
  Hasmap<println, Hasmap<sin, Hasmap<degToRad, 30>>>
old Hasmap

Hasmap<println, "sin of 30deg is">
Hasmap<doPrintSin>
```

output

```
sin of 30deg is
0.5
Finished with result: null (of NULL type)
```

Comes with interpreter and REPL built in.

## Features

The langauge comes with a Top-Down Parser, order of operations, certain type inference,
and small set of standard functions. 
