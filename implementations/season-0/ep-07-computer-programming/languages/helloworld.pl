sub welcome {
    my ($name) = @_;
    print "Hello, " . $name . ", Welcome to our World!\n";
}

my $name = "Cadet";

if ($ARGV[0]) {
    $name = $ARGV[0];
}

welcome($name);
