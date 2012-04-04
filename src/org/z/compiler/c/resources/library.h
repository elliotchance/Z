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
    void (*println_L)(String*);
    void (*println_F)(float);
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
void println_L(String *string);
void println_F(float f);
