# ScHQ9+
HQ9+ is a programming language. It is meant to expedite certain workflows.
Very specific workflows.. Workflows that involve of "Hello World!". You
know the kind.

ScHQ9+ is the name of my implementation.

[![Build Status](https://api.travis-ci.org/sguzman/HQ9Plus.png?branch=master)](https://travis-ci.org/sguzman/HQ9Plus/)

## Description
The interpreter is fully and proudly HQ9+ comptatible. That means it fully
understands all four instructions in the language.
It is written in Scala because why not.

### Instructions
So you want to know what the four instructions are? Fine... Here they are,
- **H**: Print "hello, world"
- **Q**: Print the program's source code
- **9**: Print the lyrics to "99 Bottles of Beer"
- **+**: Increment the accumulator

### Handling Syntax Issues
Taking inspiration from the [RealMan's Compiler Collection](http://somewhere.fscked.org/proj/rmcc/),
I decided to elegantly express any syntactical issues with the user's
source code with "No." So, if you include any character other than 'H', 'h',
'Q','q','9', or '+', the program will output "No." Beautiful, no?
Think of how satisfying seeing the results of your program will be once
you get it working!

### Extras
I added the file necessary to use `activator ui` for project management.
Enjoy!

#### Reference
* [HQ9+](https://esolangs.org/wiki/HQ9+) - Esolangs
* [Creator's](http://web.archive.org/web/20090602074545/http://www.cliff.biffle.org/esoterica/hq9plus.html) page
    * The creator talks about his inspiration for creating this language.
* [My site yo!](initialcommit.io)
