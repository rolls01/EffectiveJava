>But the instanceof operator is specified to
return false if its first operand is null , regardless of what type appears in the
second operand [JLS, 15.20.2]. Therefore, the type check will return false if
null is passed in, so you don’t need an explicit null check.