# Groovy NullPointerException from seemingly safe null return

This repository demonstrates a subtle issue in Groovy related to handling null values.
The `myMethod` function seemingly safely returns `null` if the input is `null`. However, if the output of `myMethod` is used without explicitly checking for `null`, a `NullPointerException` might occur unexpectedly, as shown in the example.
The solution demonstrates how to handle potential null values to avoid this issue.

## Bug
The bug is in `bug.groovy`.  The `myMethod` returns `null` when the input is `null`, which causes a `NullPointerException` further down the chain when the return value isn't explicitly handled.

## Solution
The solution is in `bugSolution.groovy`. It introduces explicit null checks to prevent the `NullPointerException`.