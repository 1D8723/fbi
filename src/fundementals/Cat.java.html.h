<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang = "en">

<head>

<link rel="shortcut icon" href="https://algs4.cs.princeton.edu/favicon.ico">
<link rel="stylesheet"    href="https://algs4.cs.princeton.edu/java.css" type="text/css">

<title>Cat.java</title>

<meta HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=iso-8859-1">
<meta NAME="AUTHOR" CONTENT="Robert Sedgewick and Kevin Wayne">
<meta NAME="DESCRIPTION" CONTENT="Cat code in Java">
<meta NAME="TITLE" CONTENT="Cat code in Java">
<meta NAME="KEYWORDS" CONTENT="Cat,java,programming,computer science,algorithm,data structure,program,code">
<meta NAME="ROBOTS" CONTENT="INDEX,FOLLOW">

</head>


<body>
<center><h1>Cat.java</h1></center><p><br>

Below is the syntax highlighted version of <a href = "Cat.java">Cat.java</a>
from <a href = "https://algs4.cs.princeton.edu/11model">&#167;1.1 Programming Model</a>.
<p><br>

<!-- Generator: GNU source-highlight 3.1.8
by Lorenzo Bettini
http://www.lorenzobettini.it
http://www.gnu.org/software/src-highlite -->
<pre><tt><span class="comment">/******************************************************************************</span>
<span class="comment"> *  Compilation:  javac Cat.java</span>
<span class="comment"> *  Execution:    java Cat input0.txt input1.txt ... output.txt</span>
<span class="comment"> *  Dependencies: In.java Out.java</span>
<span class="comment"> *  Data files:   </span><span class="url">https://algs4.cs.princeton.edu/11model/in1.txt</span>
<span class="comment"> *                </span><span class="url">https://algs4.cs.princeton.edu/11model/in2.txt</span>
<span class="comment"> *</span>
<span class="comment"> *  Reads in text files specified as the first command-line</span>
<span class="comment"> *  arguments, concatenates them, and writes the result to</span>
<span class="comment"> *  filename specified as the last command-line arguments.</span>
<span class="comment"> *</span>
<span class="comment"> *  % more in1.txt</span>
<span class="comment"> *  This is</span>
<span class="comment"> *</span>
<span class="comment"> *  % more in2.txt</span>
<span class="comment"> *  a tiny</span>
<span class="comment"> *  test.</span>
<span class="comment"> *</span>
<span class="comment"> *  % java Cat in1.txt in2.txt out.txt</span>
<span class="comment"> *</span>
<span class="comment"> *  % more out.txt</span>
<span class="comment"> *  This is</span>
<span class="comment"> *  a tiny</span>
<span class="comment"> *  test.</span>
<span class="comment"> *</span>
<span class="comment"> ******************************************************************************/</span>

<span class="comment">/**</span>
<span class="comment"> *  The {</span><span class="type">@code</span><span class="comment"> Cat} class provides a client for concatenating the results</span>
<span class="comment"> *  of several text files.</span>
<span class="comment"> *  </span><span class="keyword">&lt;p&gt;</span>
<span class="comment"> *  For additional documentation, see </span><span class="keyword">&lt;a</span><span class="normal"> </span><span class="type">href</span><span class="symbol">=</span><span class="string">"https://algs4.cs.princeton.edu/11model"</span><span class="keyword">&gt;</span><span class="comment">Section 1.1</span><span class="keyword">&lt;/a&gt;</span><span class="comment"> of</span>
<span class="comment"> *  </span><span class="keyword">&lt;i&gt;</span><span class="comment">Algorithms, 4th Edition</span><span class="keyword">&lt;/i&gt;</span><span class="comment"> by Robert Sedgewick and Kevin Wayne.</span>
<span class="comment"> *</span>
<span class="comment"> *  </span><span class="type">@author</span><span class="comment"> Robert Sedgewick</span>
<span class="comment"> *  </span><span class="type">@author</span><span class="comment"> Kevin Wayne</span>
<span class="comment"> */</span>
<span class="keyword">public</span><span class="normal"> </span><span class="keyword">class</span><span class="normal"> </span><span class="classname">Cat</span><span class="normal"> </span><span class="cbracket">{</span>

<span class="normal">    </span><span class="comment">// this class should not be instantiated</span>
<span class="normal">    </span><span class="keyword">private</span><span class="normal"> </span><span class="function">Cat</span><span class="symbol">()</span><span class="normal"> </span><span class="cbracket">{</span><span class="normal"> </span><span class="cbracket">}</span>

<span class="normal">    </span><span class="comment">/**</span>
<span class="comment">     * Reads in a sequence of text files specified as the first command-line</span>
<span class="comment">     * arguments, concatenates them, and writes the results to the file</span>
<span class="comment">     * specified as the last command-line argument.</span>
<span class="comment">     *</span>
<span class="comment">     * </span><span class="type">@param</span><span class="comment"> args the command-line arguments</span>
<span class="comment">     */</span>
<span class="normal">    </span><span class="keyword">public</span><span class="normal"> </span><span class="keyword">static</span><span class="normal"> </span><span class="type">void</span><span class="normal"> </span><span class="function">main</span><span class="symbol">(</span><span class="normal">String</span><span class="symbol">[]</span><span class="normal"> args</span><span class="symbol">)</span><span class="normal"> </span><span class="cbracket">{</span>
<span class="normal">        </span><span class="usertype">Out</span><span class="normal"> out </span><span class="symbol">=</span><span class="normal"> </span><span class="keyword">new</span><span class="normal"> </span><span class="function">Out</span><span class="symbol">(</span><span class="normal">args</span><span class="symbol">[</span><span class="normal">args</span><span class="symbol">.</span><span class="normal">length </span><span class="symbol">-</span><span class="normal"> </span><span class="number">1</span><span class="symbol">]);</span>
<span class="normal">        </span><span class="keyword">for</span><span class="normal"> </span><span class="symbol">(</span><span class="type">int</span><span class="normal"> i </span><span class="symbol">=</span><span class="normal"> </span><span class="number">0</span><span class="symbol">;</span><span class="normal"> i </span><span class="symbol">&lt;</span><span class="normal"> args</span><span class="symbol">.</span><span class="normal">length </span><span class="symbol">-</span><span class="normal"> </span><span class="number">1</span><span class="symbol">;</span><span class="normal"> i</span><span class="symbol">++)</span><span class="normal"> </span><span class="cbracket">{</span>
<span class="normal">            </span><span class="usertype">In</span><span class="normal"> in </span><span class="symbol">=</span><span class="normal"> </span><span class="keyword">new</span><span class="normal"> </span><span class="function">In</span><span class="symbol">(</span><span class="normal">args</span><span class="symbol">[</span><span class="normal">i</span><span class="symbol">]);</span>
<span class="normal">            </span><span class="usertype">String</span><span class="normal"> s </span><span class="symbol">=</span><span class="normal"> in</span><span class="symbol">.</span><span class="function">readAll</span><span class="symbol">();</span>
<span class="normal">            out</span><span class="symbol">.</span><span class="function">println</span><span class="symbol">(</span><span class="normal">s</span><span class="symbol">);</span>
<span class="normal">            in</span><span class="symbol">.</span><span class="function">close</span><span class="symbol">();</span>
<span class="normal">        </span><span class="cbracket">}</span>
<span class="normal">        out</span><span class="symbol">.</span><span class="function">close</span><span class="symbol">();</span>
<span class="normal">    </span><span class="cbracket">}</span>

<span class="cbracket">}</span>
</tt></pre>

<script type="text/javascript">
var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
</script>
<script type="text/javascript">
try {
var pageTracker = _gat._getTracker("UA-10811519-2");
pageTracker._trackPageview();
} catch(err) {}</script>

</body>

<p><br><address><small>
Copyright &copy; 2000&ndash;2019, Robert Sedgewick and Kevin Wayne.
<br>Last updated: Thu Aug 11 07:59:46 EDT 2022.
</small></address>

</html>
