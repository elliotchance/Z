#ifndef _H_library
#define _H_library

#include <stdlib.h>
#include <stdio.h>
#include <memory.h>

#define jfinal
#define jstatic
#define jnative
#define jsynchronized
#define jpublic
#define jprotected
#define jprivate

/*typedef struct {
    int len;
    char* data;
} String;*/

/*typedef struct {
    void (*println_L)(String*);
    void (*println_F)(float);
} PrintStream;*/

/*typedef struct {
    PrintStream *out;
} System;*/

// variables
//System *static_System;

// prototypes
void _init();
//String* _String_new(char* raw);
//java_lang_Object* _Object_new(char* className, void* obj);
//void println_L(String *string);
//void println_F(float f);

void throwException(char* className, char* message);

#endif
