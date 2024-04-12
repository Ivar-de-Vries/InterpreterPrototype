grammar interperter;

interperter: function direction INT;

function: 'move';

direction: 'north' | 'south' | 'east' | 'west';

INT: [0-9]+;

WS: [ \t\r\n]+ -> skip;