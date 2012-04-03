#include <stdlib.h>
#include <stdio.h>
#include <memory.h>

typedef struct {
    char *className;
    void *obj;
} Object;

typedef struct {
    int len;
    char* data;
} String;

typedef struct {
    void (*println)(String*);
} PrintStream;

typedef struct {
    PrintStream *out;
} System;

// variables
System *static_System;

// prototypes
void _init();
String* _String_new(char* raw);
Object* _Object_new(char* className, void* obj);
void println(String *string);
